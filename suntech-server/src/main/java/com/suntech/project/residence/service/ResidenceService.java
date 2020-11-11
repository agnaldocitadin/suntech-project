package com.suntech.project.residence.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import com.suntech.project.BaseService;
import com.suntech.project.residence.model.Residence;
import com.suntech.project.residence.repository.ResidenceRepository;

@Service
public class ResidenceService extends BaseService {

	private ResidenceRepository repository;

	public ResidenceService(EntityManager entityManager, ResidenceRepository repository) {
		super(entityManager);
		this.repository = repository;
	}

	public Residence save(Residence residence) {
		return repository.save(residence);
	}

	public List<Residence> findAll() {
		return repository.findAll();
	}

	public boolean remove(Long id) {
		repository.deleteById(id);
		return true;
	}

//	private void preparaEntidade(Residencia cliente) {
//		cliente.defineTipo();
//		Optional.ofNullable(cliente.getEndereco())
//				.ifPresent(Endereco::removeFormatacaoCEP);
//
//		Optional.ofNullable(cliente.getTelefones())
//				.ifPresent(telefones -> telefones.stream()
//						.forEach(telefone -> telefone.removeFormatacaoTelefone()));
//	}
//
//	public Residencia salvar(Residencia cliente) {
//		preparaEntidade(cliente);
//		cliente.getTelefones().forEach(telefone -> telefone.setCliente(cliente));
//		return repository.save(cliente);
//	}
//
//	public boolean excluir(Long id) {
//		repository.deleteById(id);
//		return true;
//	}
//
//	public List<Residencia> buscar(String argumento) {
//		if (argumento != null) {
//
//			QCliente qCliente = QCliente.cliente;
//			QTelefone qTelefone = QTelefone.telefone;
//
//			final JPAQuery<Residencia> query = createJPAQuery();
//			BooleanBuilder where = new BooleanBuilder();
//			where
//				.or(qCliente.nome.containsIgnoreCase(argumento))
//				.or(qCliente.razaoSocial.containsIgnoreCase(argumento))
//				.or(qCliente.cpfCnpj.containsIgnoreCase(argumento))
//				.or(qCliente.tipo.stringValue().containsIgnoreCase(argumento))
//				.or(qCliente.classificacao.stringValue().containsIgnoreCase(argumento))
//				.or(qCliente.email.containsIgnoreCase(argumento))
//				.or(qCliente.endereco.cep.containsIgnoreCase(argumento))
//				.or(qCliente.endereco.rua.containsIgnoreCase(argumento))
//				.or(qCliente.endereco.bairro.containsIgnoreCase(argumento))
//				.or(qCliente.endereco.cidade.containsIgnoreCase(argumento))
//				.or(qCliente.endereco.estado.stringValue().equalsIgnoreCase(argumento))
//				.or(qTelefone.numero.contains(argumento));
//
//			return query
//					.select(qCliente)
//					.distinct()
//					.from(qCliente)
//					.join(qCliente.telefones, qTelefone)
//					.where(where)
//					.fetch();
//		}
//		return repository.findAll();
//	}

}
